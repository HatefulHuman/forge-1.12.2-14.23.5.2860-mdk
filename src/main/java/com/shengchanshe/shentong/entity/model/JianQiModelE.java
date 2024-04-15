package com.shengchanshe.shentong.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class JianQiModelE extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone_E;

    public JianQiModelE() {
        textureWidth = 16;
        textureHeight = 16;
        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 4.0F, 0.0F);

        bone_E = new ModelRenderer(this);
        bone_E.setRotationPoint(0.0F, 20.0F, 0.0F);
        bone.addChild(bone_E);
        setRotationAngle(bone_E, 0.0F, 1.5708F, 0.0F);

        bone_E.cubeList.add(new ModelBox(bone_E, 0, 1, 5.0F, -22.0F, 0.0F, 3, 0, 1, 0.0F, false));
        bone_E.cubeList.add(new ModelBox(bone_E, 0, 2, -5.0F, -22.0F, -1.0F, 3, 0, 1, 0.0F, false));
        bone_E.cubeList.add(new ModelBox(bone_E, 0, 0, -2.0F, -22.0F, -2.0F, 4, 0, 1, 0.0F, false));
        bone_E.cubeList.add(new ModelBox(bone_E, 0, 3, 2.0F, -22.0F, -1.0F, 3, 0, 1, 0.0F, false));
        bone_E.cubeList.add(new ModelBox(bone_E, 0, 4, -8.0F, -22.0F, 0.0F, 3, 0, 1, 0.0F, false));

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone_E.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
