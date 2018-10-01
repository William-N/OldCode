package solution;

import solution.Node;

class Solution 
{
    public Node intersect(Node quadTree1, Node quadTree2) 
    {
        boolean intersectNodeTopLeftValue = true;
        boolean intersectNodeTopRightValue = true;
        boolean intersectNodeBottomLeftValue = true;
        boolean intersectNodeBottomRightValue = true;
        boolean intersectNodeValue = true;
        
        //Recursively union each quadTree seperately
        recursiveUnion(quadTree1);
        recursiveUnion(quadTree2);
                
        
        if(!(quadTree1.getTopLeft().getValue() == true || quadTree2.getTopLeft().getValue() == true))
        {
            intersectNodeTopLeftValue = false;
        }
        if(!(quadTree1.getTopRight().getValue() == true || quadTree2.getTopRight().getValue() == true))
        {
            intersectNodeTopRightValue = false;
        }
        if(!(quadTree1.getBottomLeft().getValue() == true || quadTree2.getBottomLeft().getValue() == true))
        {
            intersectNodeBottomLeftValue = false;
        }
        if(!(quadTree1.getBottomRight().getValue() == true || quadTree2.getBottomRight().getValue() == true))
        {
            intersectNodeBottomRightValue = false;
        }
        if(intersectNodeTopLeftValue = false || intersectNodeTopRightValue == false || intersectNodeBottomLeftValue == false || intersectNodeBottomRightValue == false)
        {
            intersectNodeValue = false;
        }
        
        //create node after determining the four boolean values
        //that'll reside in it.
        Node intersectNode = new Node(intersectNodeValue, false, new Node(intersectNodeTopLeftValue), new Node(intersectNodeTopRightValue), new Node(intersectNodeBottomLeftValue), new Node(intersectNodeBottomRightValue));
        
        return intersectNode;
    }
    
    /**
    * Seperate all child nodes till a basecase of leaf nodes is obtained.
    * Union leaf nodes to determine truth value of parent nodes, recursively.
    */
    public void recursiveUnion(Node currentNode)
    {
        //If current node is not a leaf, break down child nodes to leaf components
        if(currentNode.isLeaf != true)
        {
            recursiveUnion(currentNode.getTopLeft());
            recursiveUnion(currentNode.getTopRight());
            recursiveUnion(currentNode.getBottomLeft());
            recursiveUnion(currentNode.getBottomRight());
        }
        
        /**
         *If current node is leaf, assign value to node by implmenting union logic:
         *in this case, if one element of node is true, then the node itself is true.
         */
        
        if(currentNode.topLeft.val == true || currentNode.topLeft.val == true || currentNode.bottomLeft.val == true || currentNode.bottomRight.val == true)
        {
            currentNode.val = true;
        }
    }
}