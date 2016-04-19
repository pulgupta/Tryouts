package org.study.patterns;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This is the best way to create a Singleton class
 * The benefits are :
 * 	Lazy initialization
 * 	No one can create a new instance even after using reflection
 * @author pulgupta
 *
 */
public class SingeltonApproach2 {
	
	static SingeltonApproach2 ref;
	final static Logger logger  = Logger.getLogger("SingeltonApproach2");
	
	private SingeltonApproach2() throws InstantiationException {
		if(ref != null)
			throw new InstantiationException();
	}

	/**
	 * This synchronization is requried else it can happen that two threads are 
	 * trying to access this method and would 
	 * @return
	 */
	public static synchronized SingeltonApproach2 newInstance() {
		
		if(ref == null){
			try {
				ref = new SingeltonApproach2();
			} catch (InstantiationException e) {
				logger.log(Level.WARNING, "Some idiot tried to create a new instance");
			}
		}
		return ref;
	}
	
	public static void main(String[] args)  {
		try {
			SingeltonApproach2 sa = new SingeltonApproach2();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SingeltonApproach2 sa2 = SingeltonApproach2.newInstance();
		SingeltonApproach2 sa3 = SingeltonApproach2.newInstance();
		
	}
	
}
