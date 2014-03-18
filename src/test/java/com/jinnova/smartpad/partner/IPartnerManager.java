package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.db.IBranchDao;
import com.jinnova.smartpad.db.IUserDao;

public interface IPartnerManager {
	
	IUserDao getUserDao();
	
	IBranchDao getBranchDao();
}
