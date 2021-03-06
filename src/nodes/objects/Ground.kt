package sandbox.nodes

import sandbox.materials.Phong
import sandbox.models.Mesh
import sandbox.models.Texture2D

import org.lwjgl.opengl.GL13.*

class Ground : VisibleNode {
    constructor() : super() {
        mesh = Mesh(
            path = "resources/ground/ground.obj",
            material = Phong().apply {
                unshadedUniforms.diffuseTexture = Texture2D(
                    path = "resources/ground/ground.jpg",
                    unit = GL_TEXTURE0
                )
            }
        )
    }
}
