package sandbox.materials

abstract class Material {
    abstract val shader: Shader

    inline fun use(f: () -> Unit) { bind(); f(); unbind() }
    open fun bind() { shader.bind() }
    open fun unbind() { shader.unbind() }

}
