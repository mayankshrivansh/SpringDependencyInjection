package org.lifecycle2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean, DisposableBean {
	
public void greeting(){
		
		System.out.println("Welcome friend, this is lifecycle demo with implementing interface !!!");
	}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Distruction of bean with implementing interface !!");
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Initialization of bean with implementing interface !!");
}

}
