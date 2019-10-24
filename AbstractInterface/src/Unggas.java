import Behaviour.BehaviourTerbang;

public abstract class Unggas {
	private String type;
	private BehaviourTerbang behaviourTerbang;
	
	public abstract void terbang();
	public abstract void bertelur();
	
	public void bisaTerbang(){
		behaviourTerbang.terbang();
	}
	public void setBehaviourTerbang(BehaviourTerbang behaviourTerbang) {
		this.behaviourTerbang = behaviourTerbang;
	}
	
	
}
