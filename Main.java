class Main
{
    public static void main(String args[])
    {
        Balls c1= new Balls("Cricket Ball");
        Balls c2= new Balls("FootBall");
        Balls c3= new Balls("Hockey Ball");
        Balls c4= new Balls("Table Tanix");
        Balls c5= new Balls("Snooker");
        Balls c6= new Balls("Tanis");

        BallList cl = new BallList(13);
        cl.add(c1);
        cl.add(c2);
        cl.add(c3);
        cl.add(c4);
        cl.add(c5);
        cl.add(c6);


        Customer p1 = new Customer("Abc", c1);
        Customer p2 = new Customer("xyz", c2);
        Customer p3 = new Customer("abxy", c3);
        Customer p4 = new Customer("xyab",c4);
        Customer p5 = new Customer("abyz", c5);
        Customer p6 = new Customer("x", c6);

        CustomerList pl = new CustomerList(12);
        pl.add(p1);
        pl.add(p2);
        pl.add(p3);
        pl.add(p4);
        pl.add(p5);
        pl.add(p6);


        IteratorPlan custit = pl.getIterator();
        while(custit.hasNext()){
            Customer c = (Customer)custit.next();
            c.getDetails();
        }

        IteratorPlan carit = cl.getIterator();
        while(carit.hasNext()){
            Balls c = (Balls)carit.next();
            c.getDetails();
        }
    }
}