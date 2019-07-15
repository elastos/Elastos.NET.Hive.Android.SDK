/*
 * Copyright (c) 2019 Elastos Foundation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.elastos.hive;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

/**
 * Hive Directory
 * First of all , create Hive Client,
 * Second , build the Hive Drive from the Hive Client
 * Third , build the Hive Directory from the Hive Drive
 */
public abstract class Directory extends Result implements ResourceItem<Directory.Info>, DirectoryItem,  FileItem {
	/**
	 * Associated directory's information<br>
	 * The result is filled into {@link Directory.Info}<br>
	 */
	public static class Info extends AttributeMap {
		/**
		 * Directory item id
		 */
		public static final String itemId = "ItemId";
		public static final String name   = "Name";
		public static final String childCount   = "ChildCount";

		/**
		 * {@link Directory.Info} constructor
		 * @param hash Directory information hashmap
		 */
		public Info(HashMap<String, String> hash) {
			super(hash);
		}
	}

	/**
	 * Get children for current directory<br>
	 * <br>
	 * This function is effective only when state of {@link Directory} is "logined".<br>
	 * <br>
	 * @return Returns A list of directories
	 */
	public abstract CompletableFuture<Children> getChildren();

	/**
	 * List for current directory<br>
	 * <br>
	 * This function is effective only when state of {@link Directory} is "logined".<br>
	 * <br>
	 * @param callback Callback getChildren result
	 * @return Returns List for current directory
	 */
	public abstract CompletableFuture<Children> getChildren(Callback<Children> callback);
}
