package de.olihock.drones.simulation;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.Animator;

public class SimulationMain {

    public static void main(String[] args) {

        GLCapabilities glCapabilities = new GLCapabilities(GLProfile.get(GLProfile.GL2));
        glCapabilities.setBackgroundOpaque(false);
        GLWindow glWindow = GLWindow.create(glCapabilities);

        glWindow.setTitle("Drone Formation");
        glWindow.setSize(400, 400);
        glWindow.setUndecorated(false);
        glWindow.setPointerVisible(true);
        glWindow.setVisible(true);

        glWindow.addGLEventListener(new Drone());

        Animator animator = new Animator();
        animator.add(glWindow);
        animator.start();
    }

}
