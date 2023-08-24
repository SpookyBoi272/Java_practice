package com.cwh.shape;
public class square extends shape{
    square(int dim1){
        super(dim1, -1);
    }

    public int area(){
        return dim1*dim1;
    }
}
