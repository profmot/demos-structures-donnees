package demo3_1.etape3;

public interface Athlete<A extends Athlete<A>> extends Comparable<A> {

	String nom();

}
