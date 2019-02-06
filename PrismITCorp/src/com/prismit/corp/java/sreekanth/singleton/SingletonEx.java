package com.prismit.corp.java.sreekanth.singleton;

public class SingletonEx  {
	public static SingletonEx getInstanceUsingDoubleLocking(){
		    Object instance = null;
			if(instance == null){
		        synchronized (SingletonEx.class) {
		            if(instance == null){
		                instance = new SingletonEx();
		            }
		        }
		    }
		    return (SingletonEx) instance;
		}
}