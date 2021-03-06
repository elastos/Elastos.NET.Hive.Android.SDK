package org.elastos.hive;

import java.util.concurrent.CompletableFuture;

public interface HiveURLInfo {

	/**
	 * Calls a script represented by the parsed hive url.
	 * Internally calls client.getVault().getScripting().call("scriptName", {params});
	 */
	<T> CompletableFuture<T> callScript(Class<T> resultType);

	/**
	 * Returns the vault targeted by the parsed url. Useful to be able to call consecutive actions following
	 * the script call, such as a file download or upload.
	 */
	CompletableFuture<Vault> getVault();

	 UrlInfo deserialize(String hiveUrl);
}
