public class Switch {
    public static void main(String args[])
    {
        String n="India";
        switch(n.toUpperCase())
        {
            case "INDIA":
                System.out.println("True Indeed");
                break;
            case "india":
                System.out.println("False");
                break;

        }

    }
}
