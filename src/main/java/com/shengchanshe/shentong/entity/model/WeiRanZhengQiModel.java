package com.shengchanshe.shentong.entity.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WeiRanZhengQiModel extends ModelBase {
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone;

	public WeiRanZhengQiModel() {
		textureWidth = 128;
		textureHeight = 128;

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 9.0F, 7.0F);


		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -17.5809F, -5.9365F);
		bone4.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 35, -5.0F, 12.4832F, -1.6181F, 10, 18, 6, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 32, 25, -3.0F, 10.4832F, -1.8681F, 6, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, 14.4832F, -1.3681F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 95, 1, -1.0F, -4.0F, -0.5F, 2, 8, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.5F, -9.9191F, -4.0635F);
		bone2.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -8.5F, -4.5F, 0.0F, 10, 10, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 32, 10, -9.0F, -6.5F, -0.5F, 11, 5, 10, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0873F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, -2.5F, 0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0873F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, -0.5F, 0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0F, 1.6533F, 13.361F);
		bone5.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.1345F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 83, 63, -1.0F, 1.5F, -3.0F, 3, 1, 8, 0.01F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.0F, -4.1381F, 11.715F);
		bone5.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.5672F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 68, 18, -5.0F, -2.5F, -4.5F, 11, 7, 6, 0.01F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.0F, -5.4661F, 6.387F);
		bone5.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 20, -5.0F, -2.5F, -6.5F, 11, 2, 10, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.8682F, -5.1075F, 3.4781F);
		bone2.addChild(bone3);


		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7893F, -0.4611F, -0.2313F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 60, -7.0F, 7.5031F, -2.8533F, 11, 6, 6, -0.01F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.1318F, 2.4384F, -1.7916F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.8765F, -0.1685F, 0.0456F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 77, 48, -1.0F, -0.4969F, -2.8533F, 5, 8, 6, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-7.9994F, 5.7039F, 1.7421F);
		bone2.addChild(bone7);


		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.5672F, -0.3927F, 0.2618F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 72, -4.0F, -2.4969F, -3.1467F, 5, 10, 6, -0.01F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.9994F, -7.373F, -0.0556F);
		bone7.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.1309F, -0.3927F, 0.2618F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 75, 32, -4.0F, -2.4969F, -3.1467F, 5, 10, 6, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 17.5873F, 4.4977F);
		bone2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 59, -5.0F, -22.1041F, -6.1158F, 10, 15, 6, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 32, 72, -6.0F, -22.1041F, -0.1158F, 12, 15, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 0, -6.0F, -8.1F, -1.5F, 12, 14, 3, -0.01F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.5F, -19.6041F, -6.1158F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.6109F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 80, -0.475F, -3.5F, -0.5F, 1, 13, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, -19.6041F, -6.1158F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.6545F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.75F, -3.5F, -0.5F, 1, 6, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.5F, -21.1041F, -3.6158F);
		bone6.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.0436F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 28, -1.5F, -1.0F, -3.5F, 3, 28, 7, 0.0F, true));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(4.5F, -21.1041F, -3.6158F);
		bone6.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.0436F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 28, -1.5F, -1.0F, -3.5F, 3, 28, 7, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.5F, -11.75F, -10.75F);
		bone4.addChild(bone);
		setRotationAngle(bone, 0.3054F, 0.0F, 0.6981F);
		bone.cubeList.add(new ModelBox(bone, 0, 80, -1.5F, -8.5F, -1.5F, 3, 17, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 5, -1.5F, -12.5F, -1.5F, 3, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 0, -1.5F, 10.5F, -1.5F, 3, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 80, -1.0F, -10.5F, -1.0F, 2, 21, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}