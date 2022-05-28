package de.olihock.drones.simulation;

import com.jogamp.opengl.*;

public class Drone implements GLEventListener {

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        GL2 gl = glAutoDrawable.getGL().getGL2();
        glAutoDrawable.getGL().getGL2().glColor3f(1, 1, 1);
        glAutoDrawable.getGL().getGL2().glBegin(GL.GL_TRIANGLE_FAN);
        glAutoDrawable.getGL().getGL2().glVertex3f(-20, -20, 0);
        glAutoDrawable.getGL().getGL2().glVertex3f(+20, -20, 0);
        glAutoDrawable.getGL().getGL2().glVertex3f(0, 20, 0);
        glAutoDrawable.getGL().getGL2().glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int x, int y, int width, int height) {

    }

}
