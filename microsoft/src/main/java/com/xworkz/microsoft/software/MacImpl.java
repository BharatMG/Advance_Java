package com.xworkz.microsoft.software;

import org.springframework.stereotype.Component;

@Component
public class MacImpl implements Software {

	public MacImpl() {
		System.out.println("MacImpl");
	}

	@Override
	public boolean onSave() {
		// TODO Auto-generated method stub
		return false;
	}

}
