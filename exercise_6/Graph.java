public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 5;
        int noEdges = 6;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph


        myGraph.edge[0].src = "Vincent";
        myGraph.edge[0].dest = "Glorienne";


        myGraph.edge[1].src = "Vincent";
        myGraph.edge[1].dest = "Kiel";


        myGraph.edge[2].src = "Vincent";
        myGraph.edge[2].dest = "Adrian";


        myGraph.edge[3].src = "Vincent";
        myGraph.edge[3].dest = "Leo";

        myGraph.edge[4].src = "Glorienne";
        myGraph.edge[4].dest = "Kiel";

        myGraph.edge[5].src = "Kiel";
        myGraph.edge[5].dest = "Adrian";
        // print graph
        
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}