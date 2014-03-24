package com.jinnova.smartpad.member;

import com.jinnova.smartpad.IPagingList;
import com.jinnova.smartpad.partner.ICatalog;
import com.jinnova.smartpad.partner.ICatalogItem;
import com.jinnova.smartpad.partner.IOperation;
import com.jinnova.smartpad.partner.IPromotion;
import com.jinnova.smartpad.partner.IPromotionSort;
import com.jinnova.smartpad.partner.IRecordInfoHolder;

public interface IMember extends IRecordInfoHolder {

	/**
	 * @param operation
	 * @return related promotions which this consumer likes (sorted?)
	 */
	IPagingList<IPromotion, IPromotionSort> getRelatedPromotions(IOperation operation);

	/**
	 * @param catalog
	 * @return related promotions which this consumer likes
	 */
	IPagingList<IPromotion, IPromotionSort> getRelatedPromotions(ICatalog catalog);

	/**
	 * @param catalogItem
	 * @return related promotions which this consumer likes
	 */
	IPagingList<IPromotion, IPromotionSort> getRelatedPromotions(ICatalogItem catalogItem);

	IMemberCard[] getMemberCards();

	ICreditCard[] getCreditCards();
}
