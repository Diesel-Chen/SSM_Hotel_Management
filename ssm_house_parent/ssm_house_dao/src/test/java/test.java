import org.junit.Test;

public class test {
    public static void main(String[] args) {
        String zhengquedaan = "答案1,答案2,答案3,答案4";
        String my = "  答案4";
        String[] strings = zhengquedaan.split(",");
        System.out.println("strings="+strings);
        for(String s:strings){
//            System.out.println(s);
//            System.out.println(s.equalsIgnoreCase(my));
            System.out.println(compare(s,my));
        }

    }

    public static boolean compare(String str1,String str2){
        String s1 = str1.replace(" ", "");
        String s2 = str2.replace(" ", "");
        return s1.equalsIgnoreCase(s2);
    }
    @Test
    public void  test01(){
        String sql = "123,123，1565 3548    46";
        String regex = ",|，|\\s+";
        String[] strings = sql.split(regex);
        for (String s:strings){
            System.out.println(s);
        }
    }
}
