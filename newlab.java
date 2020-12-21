package laba;
        import java.util.ArrayList;
        import java.io.*;
public class newlab {
    public static void main(String[] args) {
        ArrayList<String> FIO = new ArrayList<String>();
        String[] fio = new String[7];
        FIO.add("Игор Антон Антонов");
        FIO.add("Мурова Луиза Генедьевна");
        FIO.add("Жарин Никита Никитович");
        FIO.add("Бунин Петр Петров");
        FIO.add(1,"Сорин Унтил Унтилович");
        FIO.add("Топов Михаил Мишков");
        System.out.println(FIO.get(1));
        FIO.remove("Молодов Артем Арсенович");
        for(int i = 0;i<FIO.size();i++)System.out.println(FIO.get(i));
        System.out.println("////////////////////////");
        Object[] fiol = FIO.toArray();
        for(Object count : fiol){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try{
            FileWriter writer = new FileWriter("C:\\Users\\Ansty\\IdeaProjects\\lab78\\src\\laba\\text.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Купить:");
            String text = "Банан,Сметана,Огурцы солененькие";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Оплата завершена.");
            writer.append("\n");
            writer.write("Еще жвачку");


            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\Ansty\\IdeaProjects\\lab78\\src\\laba\\text.txt");
            System.out.println("////////////////////////");
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}