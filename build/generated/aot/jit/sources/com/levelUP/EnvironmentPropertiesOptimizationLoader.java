package com.levelUP;

import io.micronaut.core.optim.StaticOptimizations;
import io.micronaut.core.util.EnvironmentProperties;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentPropertiesOptimizationLoader implements StaticOptimizations.Loader<EnvironmentProperties> {
  private void load0(Map<String, List<String>> env) {
    env.put("PATH", Arrays.asList("path"));
    env.put("INVOCATION_ID", Arrays.asList("invocation.id", "invocation-id"));
    env.put("XAUTHORITY", Arrays.asList("xauthority"));
    env.put("XMODIFIERS", Arrays.asList("xmodifiers"));
    env.put("GDMSESSION", Arrays.asList("gdmsession"));
    env.put("XDG_DATA_DIRS", Arrays.asList("xdg.data.dirs", "xdg.data-dirs", "xdg-data.dirs", "xdg-data-dirs"));
    env.put("DBUS_SESSION_BUS_ADDRESS", Arrays.asList("dbus.session.bus.address", "dbus.session.bus-address", "dbus.session-bus.address", "dbus.session-bus-address", "dbus-session.bus.address", "dbus-session.bus-address", "dbus-session-bus.address", "dbus-session-bus-address"));
    env.put("XDG_CURRENT_DESKTOP", Arrays.asList("xdg.current.desktop", "xdg.current-desktop", "xdg-current.desktop", "xdg-current-desktop"));
    env.put("COLORTERM", Arrays.asList("colorterm"));
    env.put("MANAGERPIDFDID", Arrays.asList("managerpidfdid"));
    env.put("PTYXIS_VERSION", Arrays.asList("ptyxis.version", "ptyxis-version"));
    env.put("USERNAME", Arrays.asList("username"));
    env.put("LOGNAME", Arrays.asList("logname"));
    env.put("PWD", Arrays.asList("pwd"));
    env.put("MANAGERPID", Arrays.asList("managerpid"));
    env.put("LESSOPEN", Arrays.asList("lessopen"));
    env.put("SHELL", Arrays.asList("shell"));
    env.put("OLDPWD", Arrays.asList("oldpwd"));
    env.put("GNOME_DESKTOP_SESSION_ID", Arrays.asList("gnome.desktop.session.id", "gnome.desktop.session-id", "gnome.desktop-session.id", "gnome.desktop-session-id", "gnome-desktop.session.id", "gnome-desktop.session-id", "gnome-desktop-session.id", "gnome-desktop-session-id"));
    env.put("GTK_MODULES", Arrays.asList("gtk.modules", "gtk-modules"));
    env.put("DEBUGINFOD_URLS", Arrays.asList("debuginfod.urls", "debuginfod-urls"));
    env.put("DBUS_STARTER_ADDRESS", Arrays.asList("dbus.starter.address", "dbus.starter-address", "dbus-starter.address", "dbus-starter-address"));
    env.put("SYSTEMD_EXEC_PID", Arrays.asList("systemd.exec.pid", "systemd.exec-pid", "systemd-exec.pid", "systemd-exec-pid"));
    env.put("GNOME_SETUP_DISPLAY", Arrays.asList("gnome.setup.display", "gnome.setup-display", "gnome-setup.display", "gnome-setup-display"));
    env.put("XDG_SESSION_DESKTOP", Arrays.asList("xdg.session.desktop", "xdg.session-desktop", "xdg-session.desktop", "xdg-session-desktop"));
    env.put("LS_COLORS", Arrays.asList("ls.colors", "ls-colors"));
    env.put("SHLVL", Arrays.asList("shlvl"));
    env.put("QT_IM_MODULES", Arrays.asList("qt.im.modules", "qt.im-modules", "qt-im.modules", "qt-im-modules"));
    env.put("MEMORY_PRESSURE_WRITE", Arrays.asList("memory.pressure.write", "memory.pressure-write", "memory-pressure.write", "memory-pressure-write"));
    env.put("LESSCLOSE", Arrays.asList("lessclose"));
    env.put("QT_IM_MODULE", Arrays.asList("qt.im.module", "qt.im-module", "qt-im.module", "qt-im-module"));
    env.put("MEMORY_PRESSURE_WATCH", Arrays.asList("memory.pressure.watch", "memory.pressure-watch", "memory-pressure.watch", "memory-pressure-watch"));
    env.put("TERM", Arrays.asList("term"));
    env.put("XDG_SESSION_EXTRA_DEVICE_ACCESS", Arrays.asList("xdg.session.extra.device.access", "xdg.session.extra.device-access", "xdg.session.extra-device.access", "xdg.session.extra-device-access", "xdg.session-extra.device.access", "xdg.session-extra.device-access", "xdg.session-extra-device.access", "xdg.session-extra-device-access", "xdg-session.extra.device.access", "xdg-session.extra.device-access", "xdg-session.extra-device.access", "xdg-session.extra-device-access", "xdg-session-extra.device.access", "xdg-session-extra.device-access", "xdg-session-extra-device.access", "xdg-session-extra-device-access"));
    env.put("XDG_CONFIG_DIRS", Arrays.asList("xdg.config.dirs", "xdg.config-dirs", "xdg-config.dirs", "xdg-config-dirs"));
    env.put("LANG", Arrays.asList("lang"));
    env.put("XDG_SESSION_TYPE", Arrays.asList("xdg.session.type", "xdg.session-type", "xdg-session.type", "xdg-session-type"));
    env.put("FLATPAK_TTY_PROGRESS", Arrays.asList("flatpak.tty.progress", "flatpak.tty-progress", "flatpak-tty.progress", "flatpak-tty-progress"));
    env.put("DISPLAY", Arrays.asList("display"));
    env.put("WAYLAND_DISPLAY", Arrays.asList("wayland.display", "wayland-display"));
    env.put("_", Arrays.asList(".", "-"));
    env.put("XDG_SESSION_CLASS", Arrays.asList("xdg.session.class", "xdg.session-class", "xdg-session.class", "xdg-session-class"));
    env.put("DESKTOP_SESSION", Arrays.asList("desktop.session", "desktop-session"));
    env.put("GPG_AGENT_INFO", Arrays.asList("gpg.agent.info", "gpg.agent-info", "gpg-agent.info", "gpg-agent-info"));
    env.put("USER", Arrays.asList("user"));
    env.put("XDG_MENU_PREFIX", Arrays.asList("xdg.menu.prefix", "xdg.menu-prefix", "xdg-menu.prefix", "xdg-menu-prefix"));
    env.put("VTE_VERSION", Arrays.asList("vte.version", "vte-version"));
    env.put("QT_ACCESSIBILITY", Arrays.asList("qt.accessibility", "qt-accessibility"));
    env.put("PTYXIS_PROFILE", Arrays.asList("ptyxis.profile", "ptyxis-profile"));
    env.put("SSH_AUTH_SOCK", Arrays.asList("ssh.auth.sock", "ssh.auth-sock", "ssh-auth.sock", "ssh-auth-sock"));
    env.put("XDG_RUNTIME_DIR", Arrays.asList("xdg.runtime.dir", "xdg.runtime-dir", "xdg-runtime.dir", "xdg-runtime-dir"));
    env.put("IM_CONFIG_ENTRY", Arrays.asList("im.config.entry", "im.config-entry", "im-config.entry", "im-config-entry"));
    env.put("DBUS_STARTER_BUS_TYPE", Arrays.asList("dbus.starter.bus.type", "dbus.starter.bus-type", "dbus.starter-bus.type", "dbus.starter-bus-type", "dbus-starter.bus.type", "dbus-starter.bus-type", "dbus-starter-bus.type", "dbus-starter-bus-type"));
    env.put("HOME", Arrays.asList("home"));
  }

  @Override
  public EnvironmentProperties load() {
    Map<String, List<String>> env = new HashMap<String, List<String>>();
    load0(env);
    return EnvironmentProperties.of(env);
  }
}
