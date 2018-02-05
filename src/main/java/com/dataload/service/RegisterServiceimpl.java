package com.dataload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataload.Dao.RegisterDao;
import com.dataload.modal.RegisterNew;

@Service
public class RegisterServiceimpl implements RegisterService{
	@Autowired
	RegisterDao dao;

	@Override
	public boolean register(RegisterNew register) {
		boolean status = true;
		try {
			status = dao.register(register);
		} catch (Exception e) {
			status = false;
			System.out.println("Exception in RegisterServiceimpl.register"+e.getMessage());
			e.printStackTrace();
		}
		return status;
	}

}
