package csc133;


import javax.swing.*;
import java.io.File;

import SlRenderer.slLevelSceneEditor;
import SlRenderer.slWindow;
import static csc133.spot.*;

public class Main {
    public static void main(String[] args) {
        slWindow my_glfw_window = slWindow.get();
        long my_win = my_glfw_window.initGLFWWindow(WIN_WIDTH, WIN_HEIGHT, WINDOW_TITLE);
        slLevelSceneEditor currentScene = new slLevelSceneEditor(my_win);

        float[] cam_params = {FRUSTUM_LEFT, FRUSTUM_RIGHT, FRUSTUM_BOTTOM, FRUSTUM_TOP, Z_NEAR, Z_FAR };
        currentScene.initRendering(WIN_WIDTH, WIN_HEIGHT, cam_params);
        currentScene.renderScene();
        my_glfw_window.cleanupWindow();
    }
}








