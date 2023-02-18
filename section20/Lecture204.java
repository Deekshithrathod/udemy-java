package section20;

enum Dept{
    CS("John","Block A"), ECE("John","Block B"), CIVIL("John","Block C"), IT("John","Block D");
    private Dept(String headName, String loc){
        this.headName = headName;
        this.loc = loc;
    }
    String headName;
    String loc;

    public String getHeadName() {
        return headName;
    }

    public String getLoc() {
        return loc;
    }

}

public class Lecture204 {
    public static void main(String[] args) {
        Dept[] list = Dept.values();
        for(Dept d : list){
            System.out.println(d.name()+"-"+d.ordinal());
            System.out.println(d.getHeadName()+" "+d.getLoc());
            System.out.println("--------------");
        }
    }
}
