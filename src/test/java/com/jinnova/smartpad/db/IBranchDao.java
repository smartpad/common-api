package com.jinnova.smartpad.db;

import java.sql.SQLException;

import com.jinnova.smartpad.partner.IBranch;

public interface IBranchDao {

	void updateBranch(IBranch branch) throws SQLException;

	IBranch loadBranch(String string) throws SQLException;
}
