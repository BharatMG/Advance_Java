package com.xworkz.microsoft.software;

import org.springframework.stereotype.Component;

@Component
public class LinuxImpl implements Software {

	public LinuxImpl() {
		System.out.println("LinuxImpl");
	}

	@Override
	public boolean onSave() {
		// TODO Auto-generated method stub
		return false;
	}

}
