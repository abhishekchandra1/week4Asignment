
public class BallList implements CollectionPlan {
	    IteratorPlan it;
	    Balls[] carlist;
	    int size;
	    int numberOfCars = 0;

	    BallList(int size)
	    {
	        this.carlist = new Balls[size];
	        this.size = size;
	    }

	    public void add(Balls c)
	    {
	        if(this.numberOfCars < this.size)
	        {
	            this.carlist[this.numberOfCars] = c;
	            this.numberOfCars++;
	        }else{
	            System.out.println("Array is full");
	        }
	    }

	    public IteratorPlan getIterator() {
	        return new BallIterator();
	    }
	}

