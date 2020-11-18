import java.security.SecureRandom;

public class GilbertGenerator 
{
	private Grafo miGrafo; 

	public Grafo generate(Integer n,double p)	
	{
		Nodes nodes; 
		Edges edges; 
		miGrafo = new Grafo(); 
		miGrafo.generate();		
		nodes = miGrafo.getNodes(); 
		edges = miGrafo.getEdges(); 
		SecureRandom r = new SecureRandom(); 
		Vertice v;
		double rand = 0; 
		//Generación de nodos
		for(int i=0;i<n;i++)
		{
			nodes.addElement();
		}
		//Generacion de aristas
			
		for(int i = 1;i <=n;i++)
		{
			v = nodes.findElement(i); 
			for(int j = 1; j <=n ;j++ )
			{
				rand = r.nextDouble(); 
				
				if(edges.findEdge(i, j) == null && (rand<p))
				{
					if(i!=j)
					{
						edges.addElement(i, j);
						v.addConnetion(j);
					}
						
				}
					
			}
		}

		return miGrafo;
	}

}
