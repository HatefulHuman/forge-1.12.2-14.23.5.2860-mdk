package com.shengchanshe.shentong.entity.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CangSangZhengDaoModel extends ModelBase {
	private final ModelRenderer bone7;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;

	public CangSangZhengDaoModel() {
		textureWidth = 128;
		textureHeight = 128;

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 30.0F, -2.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -38.3309F, 26.3135F);
		bone7.addChild(bone2);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 34.3309F, -11.3135F);
		bone2.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -5.0F, -49.0F, 7.0F, 10, 10, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 34, 26, -5.0F, -50.0F, 6.0F, 10, 2, 11, 0.01F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 21, -6.0F, -49.0F, 8.0F, 12, 5, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 36, 95, -2.0F, -52.0F, 15.0F, 4, 6, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 66, 25, -6.0F, -44.0F, 12.0F, 12, 3, 6, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 40, 61, -3.0F, -40.0F, 5.0F, 6, 3, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 70, 0, -2.0F, -37.0F, 5.0F, 4, 3, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1.0F, -34.0F, 5.0F, 2, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(5.0F, -47.0F, 6.0F);
		bone3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1309F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -4.0F, 1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.0F, -47.0F, 6.0F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1309F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 21, 1.0F, 1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -43.0F, 6.0F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 53, -4.0F, 0.0F, -1.0F, 4, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -43.0F, 6.0F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 99, 46, 0.0F, 0.0F, -1.0F, 4, 2, 2, -0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(6.0F, -2.4191F, 1.6865F);
		bone2.addChild(bone4);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6981F, -0.2618F, -0.1309F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 78, -1.0F, -0.4969F, -2.8533F, 5, 10, 6, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.1071F, 6.0804F, -5.235F);
		bone4.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.6393F, -0.3974F, -0.3117F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 0, -5.5F, -3.0F, -3.0F, 11, 6, 6, -0.01F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.3183F, -3.4016F, 0.7407F);
		bone2.addChild(bone5);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.6471F, -0.1059F, 0.139F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 40, -5.0F, 5.5031F, -3.1467F, 11, 6, 6, -0.01F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.6817F, 1.2325F, 0.9458F);
		bone5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.6527F, 0.0531F, -0.0693F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 53, -5.0F, -1.4969F, -3.1467F, 5, 10, 6, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.0F, 18.9832F, -2.1181F);
		bone2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 57, 54, -5.0F, -24.5F, 0.5F, 6, 16, 7, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 35, 13, -8.0F, -11.7729F, -0.2499F, 12, 3, 8, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 76, 70, -8.0F, -24.5F, -0.5F, 3, 13, 8, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 76, 0, 1.0F, -24.5F, -0.5F, 3, 13, 8, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 37, -7.0F, -8.5F, 0.5F, 10, 20, 6, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -9.0F, 1.0F);
		bone6.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0436F, -0.0019F, -0.0436F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 88, 0.6032F, -0.3685F, -0.7118F, 4, 17, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, -9.0F, 1.0F);
		bone6.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0436F, 0.0019F, 0.0436F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 71, 92, -4.6032F, -0.3685F, -0.7118F, 4, 17, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -14.6013F, 2.8511F);
		bone6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 40, -6.0F, 4.0F, 1.0F, 12, 17, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(4.9647F, -12.023F, 3.499F);
		bone6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.1309F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 61, -4.0F, 0.0F, -4.0F, 3, 18, 8, 0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-8.9647F, -12.023F, 3.499F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.1309F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 64, 1.0F, 0.0F, -4.0F, 3, 18, 8, 0.001F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.8047F, -3.4143F, 8.7448F);
		bone2.addChild(bone);
		setRotationAngle(bone, -0.2182F, 0.0F, 0.48F);
		bone.cubeList.add(new ModelBox(bone, 48, 67, -1.0F, 5.2355F, -1.0F, 2, 8, 2, 0.03F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 13, -2.0F, -9.7645F, -1.0F, 4, 4, 2, -0.02F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.7808F, 4.7297F, 0.0F);
		bone.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.1745F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 64, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.02F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 0, 1.0F, -2.0F, -1.0F, 5, 2, 2, 0.01F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.1011F, -6.0897F, 0.0F);
		bone.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.1745F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 91, -2.25F, -3.0F, -1.0F, 5, 14, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(7.2315F, -1.6255F, 0.0F);
		bone.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.5236F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 93, 35, -2.5F, -3.0F, -1.0F, 4, 8, 2, 0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(7.2315F, -1.6255F, 0.0F);
		bone.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.2618F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 95, -5.0F, -4.5F, -1.0F, 4, 10, 2, -0.01F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.1011F, -6.0897F, 0.0F);
		bone.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.1745F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 84, 92, -2.75F, -3.0F, -1.0F, 5, 14, 2, -0.01F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-7.2315F, -1.6255F, 0.0F);
		bone.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.2618F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 99, 0, 1.0F, -4.5F, -1.0F, 4, 10, 2, -0.02F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-7.2315F, -1.6255F, 0.0F);
		bone.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.5236F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 97, 20, -1.5F, -3.0F, -1.0F, 4, 8, 2, -0.03F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.7808F, 4.7297F, 0.0F);
		bone.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.1745F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 77, 35, -6.0F, -2.0F, -1.0F, 5, 2, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 91, 70, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.01F, false));
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