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
        int noVertices = 8;
        int noEdges = 10;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph


        myGraph.edge[0].src = "Vincent";
        myGraph.edge[0].dest = "Glorienne";

        myGraph.edge[1].src = "Vincent";
        myGraph.edge[1].dest = "Kiel";

        myGraph.edge[2].src = "Vincent";
        myGraph.edge[2].dest = "Adrian";

        myGraph.edge[2].src = "Vincent";
        myGraph.edge[2].dest = "Paul";

        myGraph.edge[3].src = "Vincent";
        myGraph.edge[3].dest = "James";

        myGraph.edge[4].src = "Vincent";
        myGraph.edge[4].dest = "Leo";

        myGraph.edge[5].src = "Glorienne";
        myGraph.edge[5].dest = "Kiel";

        myGraph.edge[6].src = "Glorienne";
        myGraph.edge[6].dest = "Samantha";

        myGraph.edge[7].src = "Kiel";
        myGraph.edge[7].dest = "Adrian";

        myGraph.edge[8].src = "Adrian";
        myGraph.edge[8].dest = "Paul";

        myGraph.edge[9].src = "Paul";
        myGraph.edge[9].dest = "James";
        // print graph
        
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}