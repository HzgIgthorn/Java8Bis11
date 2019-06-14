package udemy.Java9;

import java.util.Optional;

public class ProcessApiApp {

	public static void main(String[] args) {
		int pid1 = 12040;
		int pid2 = 12345;
		
		Optional<ProcessHandle> processHandle1 = ProcessHandle.of(pid1);
		Optional<ProcessHandle> processHandle2 = ProcessHandle.of(pid2);
		
		System.out.println("pid :" + pid1 + " is present: "+ processHandle1.isPresent());
		System.out.println("pid :" + pid2 + " is present: "+ processHandle2.isPresent());
		
		ProcessHandle processHandle3 = ProcessHandle.current();
		System.out.println("current processhandle command: " + processHandle3.info());
	}

}
