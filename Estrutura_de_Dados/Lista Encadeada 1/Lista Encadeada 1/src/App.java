public class App {
    public static void main(String[] args) throws Exception {
      
        
        ListaEncadeada months = new ListaEncadeada();

        months.insert("January");
        months.insert("February");
        months.insert("March");
        months.insert("April");
        months.insert("May");
        months.insert("June");
        months.insert("July");
        months.insert("August");
        months.insert("September");
        months.insert("October");
        months.insert("November");
        months.insert("December");
        
       System.out.println(months.returnPosition(1));
       for (int i = 0; i <11;i++){
        if(months.returnPosition(i).length() > 5){
            System.out.println(months.returnPosition(i));
        }
       }
    }
}
