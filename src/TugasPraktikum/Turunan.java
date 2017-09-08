
package TugasPraktikum;

public class Turunan extends Induk {
    
    public void test(String z)
    {
        System.out.println("Method overload di dalam kelas tururan");
        System.out.println("Z:\""+z+"\"");
    }
    
    public void test(){
        System.out.println("Method override di dalam kelas turunan");
    }
}
