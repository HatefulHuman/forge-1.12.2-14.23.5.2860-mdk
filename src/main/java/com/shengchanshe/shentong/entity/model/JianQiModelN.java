package com.shengchanshe.shentong.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class JianQiModelN  extends ModelBase {
    private final ModelRenderer bone_N;

    public JianQiModelN() {
        textureWidth = 16;
        textureHeight = 16;

        bone_N = new ModelRenderer(this);
        bone_N.setRotationPoint(0.0F, 4.0F, 0.0F);
        bone_N.cubeList.add(new ModelBox(bone_N, 0, 4, -8.0F, -2.0F, 0.0F, 3, 0, 1, 0.0F, false));
        bone_N.cubeList.add(new ModelBox(bone_N, 0, 3, 2.0F, -2.0F, -1.0F, 3, 0, 1, 0.0F, false));
        bone_N.cubeList.add(new ModelBox(bone_N, 0, 0, -2.0F, -2.0F, -2.0F, 4, 0, 1, 0.0F, false));
        bone_N.cubeList.add(new ModelBox(bone_N, 0, 2, -5.0F, -2.0F, -1.0F, 3, 0, 1, 0.0F, false));
        bone_N.cubeList.add(new ModelBox(bone_N, 0, 1, 5.0F, -2.0F, 0.0F, 3, 0, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone_N.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}