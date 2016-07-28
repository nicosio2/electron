package net.cherryworm.electron.game

import box2dLight.PointLight
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType
import com.badlogic.gdx.physics.box2d.{BodyDef, FixtureDef, PolygonShape}
import net.cherryworm.electron.TextureContainer

object Exit {
	
	val fixtureDef = new FixtureDef {
		shape = new PolygonShape() {
			setAsBox(0.5f, 0.5f)
		}
		isSensor = true
	}
	
	def bodyDef(x: Float, y: Float) = new BodyDef {
		`type` = BodyType.StaticBody
		position.set(x, y)
	}
	
}

import net.cherryworm.electron.GameScreen._
import net.cherryworm.electron.game.Exit._

class Exit(level: Level, x: Int, y: Int, textureId: String) extends Entity(
	level,
	bodyDef(x + 0.5f, y + 0.5f),
	fixtureDef,
	TextureContainer(textureId),
	Option(new PointLight(level.rayHandler, LIGHT_RAYS, new Color(0x006962FF), 15.0f, 0, 0))
) {
	override def update(delta: Float, stateOn: Boolean) = Unit
	
	
}
