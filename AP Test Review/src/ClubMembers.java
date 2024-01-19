import java.util.ArrayList;

public class ClubMembers {
	
	private ArrayList<MemberInfo> memberlist;
	
	/** Adds new club members to memberlist, as described in part (a).
	 * Precondition: names is a non-empty array
	 */
	public void addMembers(String[] names, int gradYear) {
		/* to be implemented in part (a) */ 
		
		for(String n : names) { 
			MemberInfo newMember = new MemberInfo(n, gradYear, true);
			memberlist.add(newMember);
		}
		
	}
	
	
	/** Removes members who have graduated and returns a list of members who have graduated 
	 * and are in good standing, as described in part (b) 
	 * */
	
	public ArrayList<MemberInfo> removeMembers(int year) {
		/* to be implemented in part (b) */
		
		ArrayList removedMembers = new ArrayList();
		for(int x = memberlist.size()-1; x >= 0; x--) {
			if(memberlist.get(x).getGradYear() <= year && memberlist.get(x).inGoodStanding()) {
				removedMembers.add(memberlist.get(x));
			}
			
			memberlist.remove(x);
		}
		
		return removedMembers;
	}
	
	
	//There may be instance variable, constructors, and methods that are not shown.
}
