import pkg.*;

class starter {
	public class Robot {
		private int [] hall;
		private int pos;
		private boolean facingRight;
		
		private boolean forwardMoveBlocked () {
			if (facingRight ==true && pos == hall.length ()-1) {
				return true;
			}
			else if (facingRight == false && pos==0) {
				return true;
			}
			return false;
		}
		private void move (){
			if (hall[pos]> 0){
				hall [pos] = hall[pos] -1;
			}
			else if (hall[pos] ==0){
				if (forwardMoveBlocked ()==false) {
					if (facingRight){
					pos = pos + 1;
				}
					else{
						pos = pos - 1;
				}
			}
				else if (forwardMoveBlocked ()==true ){
					if (facingRight) {
					facingRight = false;
				}
					else {
						facingRight = true;
					}
				}
			}
		}
		public int clearHall{
			int nummoves = 0;
			while (hallIsClear() == false) {
					move();
					nummoves= nummoves + 1;
				}
				return nummoves;
			}
		}
	public static void main(String args[]) {
		
	}
}