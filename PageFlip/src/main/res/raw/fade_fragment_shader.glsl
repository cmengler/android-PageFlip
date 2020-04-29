precision mediump float;
uniform sampler2D u_texture;
varying vec2 v_texCoord;

void main() {
    gl_FragColor = texture2D(u_texture, v_texCoord);
    gl_FragColor.a = 0.5;
    //gl_FragColor.a *= 0.995;
}
