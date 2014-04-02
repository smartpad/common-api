package com.jinnova.smartpad.member;

import com.jinnova.smartpad.partner.IRecordInfoHolder;

public interface IMember extends IRecordInfoHolder {
	
	String getName();
	
	void setName(String name);

	/**
	 * @param operation
	 * @return related promotions which this consumer likes (sorted?)
	 */
	//IPagingList<IPromotion, IPromotionSort> getRelatedPromotions(IOperation operation);

	/**
	 * @param catalog
	 * @return related promotions which this consumer likes
	 */
	//IPagingList<IPromotion, IPromotionSort> getRelatedPromotions(ICatalog catalog);

	/**
	 * @param catalogItem
	 * @return related promotions which this consumer likes
	 */
	//IPagingList<IPromotion, IPromotionSort> getRelatedPromotions(ICatalogItem catalogItem);

	//IPagingList<IMemberCard, IMemberCardSort> getMCardPagingList();

	//IPagingList<ICreditCard, ICreditCardSort> getCCardPagingList();
}
