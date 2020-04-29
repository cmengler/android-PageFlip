package com.eschao.android.widget.pageflip;

import android.content.Context;

/**
 * Fade vertex shader program which is used to load:
 * <ul>
 *     <li>vertex_shader.glsl</li>
 *     <li>fade_fragment_shader.glsl</li>
 * </ul>
 *
 * @author eschao
 */
class FadeVertexProgram extends VertexProgram {
    /**
     * Initiate vertex shader program
     *
     * @param context Android app context
     * @return self object
     * @throws PageFlipException raise exception if fail to initiate program
     */
    public FadeVertexProgram init(Context context) throws PageFlipException {
        super.init(context, R.raw.vertex_shader, R.raw.fade_fragment_shader);
        return this;
    }
}
