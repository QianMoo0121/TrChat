package me.arasple.mc.trchat.internal.command

import org.bukkit.entity.Player
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.command.command
import taboolib.module.lang.sendLang

/**
 * CommandIgnore
 * me.arasple.mc.trchat.internal.command
 *
 * @author wlys
 * @since 2021/8/11 12:08
 */
@PlatformSide([Platform.BUKKIT])
object CommandRemoveMessage {

//    @Awake(LifeCycle.ENABLE) TODO: Not completed.
    fun c() {
        command("recall", description = "撤回消息", permission = "trchat.recall") {
            execute<Player> { _, _, _ ->

            }
            incorrectSender { sender, _ ->
                sender.sendLang("Command-Not-Player")
            }
        }
    }
}