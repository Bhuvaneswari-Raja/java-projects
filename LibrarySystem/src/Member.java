import java.util.HashMap;
import java.util.Map;

public class Member {
	private Map<Integer, String> listOfMembers = new HashMap<>();
	private Map<String, String> memberInfo = new HashMap<>();

	public Member() {
		
	}
	
	public Member(String name, String phone) {
		newMember(name);
		setPhoneNumber(name, phone);
	}

	public void newMember(String name) {
		int memberId = (int) (Math.random() * (9000 - 1000) + 1000);
		listOfMembers.put(memberId, name);
	}

	public void setPhoneNumber(String name, String phone) {
		memberInfo.put(name, phone);
	}
	
	public boolean checkMember(String name) {
		if(listOfMembers.containsValue(name)) {
			return true;
		}
		else {
			return false;
		}
	}

}
