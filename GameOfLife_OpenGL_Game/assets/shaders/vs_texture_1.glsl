
#version 430 core

// TODO: add layout information here

uniform mat4 uProjMatrix;
uniform mat4 uViewMatrix;

// TODO: declare outputs of vs shader here:


void main()
{
    // TODO:  define the two outputs here:

    gl_Position = uProjMatrix * uViewMatrix * vec4(aPos, 1.0);
}
