#version 330 core

layout (location = 0) in vec3 position;
layout (location = 1) in vec2 textureCoordinates;

out vec2 fsTextureCoordinates;

uniform mat4 model;

void main() {
    gl_Position = model * vec4(position, 1.0f);

    fsTextureCoordinates = textureCoordinates;
}

