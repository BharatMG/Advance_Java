package com.xworkz.microsoft.software;

import org.springframework.stereotype.Component;

@Component
public class WindowsImpl implements Software{
	
	public WindowsImpl() {
		System.out.println("Windows constructor");
	}

	@Override
	public boolean onSave() {
		// TODO Auto-generated method stub
		return false;
	}

}
