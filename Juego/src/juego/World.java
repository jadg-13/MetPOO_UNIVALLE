/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jadg13
 */
public class World {
     private List<Block> blocks;

    public World() {
        blocks = new ArrayList<>();
        // Añadir bloques al mundo
        blocks.add(new Block(0, 0, 0));
        blocks.add(new Block(1, 0, 0));
        blocks.add(new Block(0, 1, 0));
        blocks.add(new Block(0, 0, 1));
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    public void removeBlock(float x, float y, float z) {
        blocks.removeIf(block -> block.getX() == x && block.getY() == y && block.getZ() == z);
    }

    public void render() {
        for (Block block : blocks) {
            block.render();
        }
    }
    
}
