package com.shengchanshe.shentong.entity.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class XuanGangZhengQiModel extends ModelBase {
	private final ModelRenderer bone7;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public XuanGangZhengQiModel() {
		textureWidth = 128;
		textureHeight = 128;

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 23.75F, 1.5F);


		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 8.0F);
		bone7.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 35, 32, -5.0F, -21.75F, -8.5F, 10, 18, 6, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0F, -16.9863F, -3.5146F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 69, -6.0F, -5.5F, -1.0F, 8, 14, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.3039F, -21.0266F, -5.0F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1745F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 73, 76, 0.0F, -1.75F, -4.5F, 3, 12, 8, -0.001F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.3039F, -21.0266F, -5.0F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 73, 76, -3.0F, -1.75F, -4.5F, 3, 12, 8, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -15.2344F, -9.784F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 91, 34, -3.0F, -6.5F, 0.5F, 5, 14, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(2.8893F, -37.6984F, 10.0F);
		bone2.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 17, -7.8893F, -9.0516F, -20.5F, 10, 10, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 34, 6, -7.8893F, -10.0516F, -21.5F, 10, 3, 11, 0.01F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -8.8893F, -9.0516F, -19.5F, 12, 6, 10, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 23, 88, -4.8893F, -12.0516F, -12.5F, 4, 6, 5, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 25, 57, -8.8893F, -3.0516F, -17.5F, 12, 3, 8, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 35, 0, -4.8893F, -2.0516F, -21.5F, 4, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, -22.0F);
		bone5.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.6981F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -2.0F, -1.0F, 0.5F, 2, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.7786F, 0.0F, -22.0F);
		bone5.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.6981F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 38, 0.0F, -1.0F, 0.5F, 2, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.3893F, -4.5516F, -22.0F);
		bone5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1309F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, -1.5F, -0.5F, 0.5F, 3, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.3893F, -4.5516F, -22.0F);
		bone5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.1309F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 20, -1.5F, -0.5F, 0.5F, 3, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.3893F, 1.9484F, -19.5F);
		bone5.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.5672F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 96, -1.0F, -2.5F, 0.5F, 2, 14, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.1393F, 1.9484F, -19.5F);
		bone5.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5672F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.0F, -2.5F, 0.5F, 2, 5, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 38, -5.0F, -36.75F, -8.5F, 10, 15, 6, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 58, 61, 3.0F, -36.75F, -9.5F, 3, 14, 8, 0.0F, true));
		bone4.cubeList.add(new ModelBox(bone4, 48, 84, -3.0F, -36.75F, -4.5F, 6, 14, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 31, 21, -4.0F, -24.75F, -9.0F, 8, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 58, 61, -6.0F, -36.75F, -9.5F, 3, 14, 8, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.4109F, -35.3422F, 15.8921F);
		bone2.addChild(bone3);


		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, -22.0F);
		bone3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2666F, -0.1509F, 0.5033F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 62, 21, -4.0F, 6.25F, -2.5F, 10, 6, 6, -0.001F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-5.5891F, 0.3422F, -21.8921F);
		bone3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 81, 55, -4.0F, -1.75F, -2.5F, 5, 10, 6, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.4109F, -35.3422F, 15.8921F);
		bone2.addChild(bone6);


		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, -22.0F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2666F, 0.1509F, -0.5033F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 62, 21, -6.0F, 6.25F, -2.5F, 10, 6, 6, -0.001F, true));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(5.5891F, 0.3422F, -21.8921F);
		bone6.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 81, 55, -1.0F, -1.75F, -2.5F, 5, 10, 6, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(7.3008F, -21.2639F, 22.9359F);
		bone7.addChild(bone);
		setRotationAngle(bone, -1.7322F, -0.8793F, -1.5972F);
		bone.cubeList.add(new ModelBox(bone, 35, 4, -17.446F, 20.6725F, 2.7547F, 1, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 41, 26, -17.946F, 24.6725F, 2.7547F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 38, -17.446F, 24.9225F, 2.7547F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 41, -17.946F, 18.6725F, 3.2547F, 2, 2, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 95, 13, -17.946F, 0.8975F, 2.7547F, 2, 18, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 7, -17.196F, 0.3975F, 2.7547F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 4, -17.696F, 0.3975F, 2.7547F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 7, -18.446F, 19.6725F, 2.7547F, 3, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.3518F, 5.7381F, 0.0F);
		bone.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.4363F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 29, -22.7104F, 4.8882F, 2.7547F, 2, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.3518F, 5.7381F, 0.0F);
		bone.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.4363F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 3, -10.0062F, 19.2116F, 2.7547F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone7.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}