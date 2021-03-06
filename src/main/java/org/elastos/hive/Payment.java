package org.elastos.hive;

import org.elastos.hive.database.CountOptions;
import org.elastos.hive.payment.Order;
import org.elastos.hive.payment.PricingInfo;
import org.elastos.hive.payment.PricingPlan;
import org.elastos.hive.payment.UsingPlan;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface Payment {

	/**
	 * get vault's payment info
	 * @return PricingPlan list
	 */
	CompletableFuture<PricingInfo> getPaymentInfo();

	/**
	 * get vault pricing plan information by plan name
	 * @param planName plan name
	 * @return the instance of PricingPlan
	 */
	CompletableFuture<PricingPlan> getPricingPlan(String planName);

	/**
	 * create a order of pricing plan
	 * @param priceName
	 * @return
	 */
	CompletableFuture<String> placeOrder(String priceName);

	/**
	 * pay for  pricing plan order
	 * @param orderId
	 * @param txids
	 * @return
	 */
	CompletableFuture<Boolean> payOrder(String orderId, List<String> txids);

	/**
	 * Get order information of vault service purchase
	 * @param orderId
	 * @return
	 */
	CompletableFuture<Order> getOrder(String orderId);

	/**
	 * Get user order information list of vault service purchase
	 * @return
	 */
	CompletableFuture<List<Order>> getAllOrders();

	/**
	 * Get using price plan
	 * @return
	 */
	CompletableFuture<UsingPlan> getUsingPricePlan();

	/**
	 * get payment version
	 * @return
	 */
	CompletableFuture<String> getPaymentVersion();
}
