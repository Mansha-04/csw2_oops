public class Customer {
    class customer{
        private String name;
        private double bal=0.0;
        private int year;
        private int branchno;
        private int citycode;
        private int serialno;   
        public void setAccNumber(int year,int branchno,int citycode,int serialno){
             this.year=year;
             this.branchno=branchno;
             this.citycode=citycode;
             this.serialno=serialno;
        }
        public void setDetails(String name){
            this.name=name;
        }
        public void deposit(double dep){
            bal=dep;
        }
        public void withdraw(double with){
            bal=bal-with;
        }
        public void getDetails(){
            System.out.println("Name:"+this.name+" Balance:"+bal);
            System.out.println("Account No."+year+branchno+citycode+serialno);
        }
    }
    public static void main(String[] args) {
        customer c1=new customer();
        c1.setDetails("a");

    }
}
