package gt.edu.url.problema2;

public class ImplArrayManipulator<E> implements ArrayManipulator<E> {

	public void Swap()
	{
		
	}
	@Override
	public int subsets(List<E> set, int n) {
		int c=0;
		if (n==1)
        {
            return c;
        }
        else
        {
            for (int i = 0; i < n-1; i +=1)
            {
                subsets(set,n-1);
                if (n%2==0)
                {
                	E aux=set.get(i);
                	E aux2=set.get(n-1);
                	set.set(i, aux2);
                	set.set(n-1, aux);
                	c++;
                }
                else
                {
                	E aux=set.get(0);
                	E aux2=set.get(n-1);
                	set.set(i, aux2);
                	set.set(n-1, aux);
                	c++;
                }
            }
            subsets(set,n-1);
        }
		return c;
	}

	@Override
	public List<E> sSets(List<E> set, int n) {
		if (n==1)
        {
            return set;
        }
        else
        {
            for (int i = 0; i < n-1; i +=1)
            {
                subsets(set,n-1);
                if (n%2==0)
                {
                	E aux=set.get(i);
                	E aux2=set.get(n-1);
                	set.set(i, aux2);
                	set.set(n-1, aux);
                }
                else
                {
                	E aux=set.get(0);
                	E aux2=set.get(n-1);
                	set.set(i, aux2);
                	set.set(n-1, aux);
                }
            }
            subsets(set,n-1);
        }
		return set;
	}

}
