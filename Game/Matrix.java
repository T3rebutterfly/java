package Game;

import java.awt.Color;
import java.awt.Graphics;

public class Matrix implements StateTransition{
    
    public final static int ROWS = 20;
    
    public final static int COLS = 10;
    
    public final static int CELL_SIZE = Shape.CELL_SIZE;
    
    private static final Color COLOR_OCCUPIED = Color.LIGHT_GRAY;
    private static final Color COLOR_EMPTY = Color.WHITE;
    
    boolean map[][] = new boolean[ROWS][COLS];
    
    Shape shape;
    
    public Matrix(){ }
    
    public void newGame()
    {
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                map[row][col] = false;
            }
        }
        shape = Shape.newShape();
    }
    
    public boolean stepGame(Action action)
    {
        switch(action)
        {
            case LEFT:
                shape.x--;
                if(!actionAllowed()) shape.x++;
                break;
            case RIGHT:
                shape.x++;
                if(!actionAllowed()) shape.x--;
                break;
            case ROTATE_LEFT:
                shape.rotateLeft();
                if(!actionAllowed()) shape.undoRotate();
                break;
            case ROTATE_RIGHT:
                shape.rotateRight();
                if(!actionAllowed()) shape.undoRotate();
                break;
            case HARD_DROP:
            case SOFT_DROP:
            case DOWN:
                shape.y++;
                if(!actionAllowed())
                {
                    shape.y--;
                    return true;
                }
                break;
        }
        return false;
    }
    
    public boolean actionAllowed()
    {
        for(int shapeRow = 0; shapeRow < shape.rows; shapeRow++)
        {
            for(int shapeCol = 0; shapeCol < shape.cols; shapeCol++)
            {
                int matrixRow = shapeRow + shape.y;
                int matrixCol = shapeCol + shape.x;
                if(shape.map[shapeRow][shapeCol] 
                    && (matrixRow < 0 || matrixRow >= Matrix.ROWS
                        || matrixCol < 0 || matrixCol >= Matrix.COLS
                        || this.map[matrixRow][matrixCol]))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int lockDown()
    {
        for(int shapeRow = 0; shapeRow < shape.rows; shapeRow++)
        {
            for(int shapeCol = 0; shapeCol < shape.cols; shapeCol++)
            {
                if(shape.map[shapeRow][shapeCol])
                {
                    this.map[shapeRow + shape.y][shapeCol + shape.x] = true;
                }
            }
        }
        return clearLines();
    }
    
    public int clearLines()
    {
        int row = ROWS - 1;
        int rowsRemoved = 0;
        boolean removeThisRow;
        
        while(row >= 0)
        {
            removeThisRow = true;
            for(int col = 0; col < COLS; col++)
            {
                if(!map[row][col])
                {
                    removeThisRow = false;
                    break;
                }
            }
            
            if(removeThisRow)
            {
                for(int row1 = row; row1 > 0; row1--)
                {
                    for(int col1 = 0; col1 < COLS; col1++)
                    {
                        map[row1][col1] = map[row1 - 1][col1];
                    }
                }
                rowsRemoved++;
                for(int col = 0; col < COLS; col++)
                    map[0][col] = false;
            }
            else
            {
                row--;
            }
        }
        return rowsRemoved;
    }
    
    public void paint(Graphics g)
    {
        int yOffet = 1;
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                g.setColor(map[row][col] ? COLOR_OCCUPIED : COLOR_EMPTY);
                g.fill3DRect(col * CELL_SIZE, row * CELL_SIZE + yOffet,
                    CELL_SIZE, CELL_SIZE, true);
            }
        }
        shape.paint(g);
    }
}