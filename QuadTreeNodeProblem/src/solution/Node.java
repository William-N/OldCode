package solution;

class Node 
{
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}
    
    public Node(boolean _val)
    {
    	this.val = _val;
    	this.isLeaf = true;
    }

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) 
    {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
    
    public Node getTopLeft()
    {
    	return this.topLeft;
    }
    
    public Node getTopRight()
    {
    	return this.topRight;
    }
    
    public Node getBottomLeft()
    {
    	return this.bottomRight;
    }
    
    public Node getBottomRight()
    {
    	return this.bottomRight;
    }
    
    public boolean getValue()
    {
    	return this.val;
    }
    
    public boolean getIsLeaf()
    {
    	return this.isLeaf;
    }
}