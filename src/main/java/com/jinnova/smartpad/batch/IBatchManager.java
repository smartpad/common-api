package com.jinnova.smartpad.batch;

import java.sql.SQLException;
import java.util.Iterator;

import com.jinnova.smartpad.partner.ICatalog;
import com.jinnova.smartpad.partner.ICatalogItem;
import com.jinnova.smartpad.partner.IOperation;
import com.jinnova.smartpad.partner.IPromotion;

public interface IBatchManager {

	Iterator<IOperation> operationIterator() throws SQLException;
	
	Iterator<ICatalog> catalogIterator() throws SQLException;
	
	Iterator<ICatalogItem> catalogItemIterator() throws SQLException;
	
	Iterator<IPromotion> promotionIterator() throws SQLException;
}
